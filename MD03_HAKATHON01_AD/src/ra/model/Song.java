package ra.model;

import java.util.Date;
import java.util.Scanner;

import static ra.run.MusicManagement.*;

public class Song {
    Scanner scanner = new Scanner(System.in);
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
        this.createdDate = new Date();
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = new Date();
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

//    public void setSongId(String songId) {
//        this.songId = songId;
//    }

    public String getSongName() {
        return songName;
    }

//    public void setSongName(String songName) {
//        this.songName = songName;
//    }

//    public String getDescriptions() {
//        return descriptions;
//    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

//    public void setSinger(Singer singer) {
//        this.singer = singer;
//    }

//    public String getSongWriter() {
//        return songWriter;
//    }

//    public void setSongWriter(String songWriter) {
//        this.songWriter = songWriter;
//    }

    public Date getCreatedDate() {
        return createdDate;
    }

//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }

//    public boolean isSongStatus() {
//        return songStatus;
//    }

//    public void setSongStatus(boolean songStatus) {
//        this.songStatus = songStatus;
//    }

    public void inputData(Song[] arrSong, int indexSong, Singer[] arrSinger, int indexSinger) {

        System.out.println("Nhập mã bài hát");
        while (true) {
            this.songId = scanner.nextLine();

            if (this.songId.startsWith("S")) {
                if (this.songId.length() == 4) {
                    boolean isDuplicate = false;
                    for (int i = 0; i < indexSong; i++) {
                        isDuplicate = false;
                        if (arrSong[i].getSongId().equalsIgnoreCase(this.songId)) {
                            isDuplicate = true;
//                            break;
                        }
                    }
                    if (isDuplicate) {
                        System.out.println("Mã bài hát đã tồn tại, vui lòng nhập lại");
                    } else {
                        break;
                    }

                } else {
                    System.out.println("Mã bài hát phải có 4 ký tự, vui lòng nhập lại");
                }
            } else {
                System.out.println("Mã bài hát phải bắt đầu bằng ký tự 'S', vui lòng nhập lại");
            }
        }

        while (true) {
            System.out.println("Nhập tên bài hát");
            this.songName = scanner.nextLine();
            if (this.songName.isEmpty()) {
                System.out.println("Tên bài hát không được để trống");
            } else {
                break;
            }
        }

        System.out.println("Nhập mô tả bài hát");
        this.descriptions = scanner.nextLine();

//        while (true) {
        System.out.println("Danh sách tất cả ca sĩ");
        for (int i = 0; i < indexSinger; i++) {
            arrSinger[i].displayData();
        }

        System.out.println("Nhập mã ca sĩ");
        int singerId = Integer.parseInt(scanner.nextLine());
        this.singer = findSingerById(singerId);
        if (singer == null) {
            System.out.println("Không tìm thấy ca sĩ với mã vừa nhập, vui lòng thêm mới");
            addSinger();
            singer = findSingerById(singerId);
        }
//            else {
//                break;
//            }
//        }


        while (true) {
            System.out.println("Nhập tên nhạc sĩ");
            this.songWriter = scanner.nextLine();
            if (this.songWriter.isEmpty()) {
                System.out.println("Tên nhạc sĩ không được để trống");
            } else {
                break;
            }
        }

        System.out.println("Nhập trạng thái bài hát (true/false)");
        this.songStatus = Boolean.parseBoolean(scanner.nextLine());

    }

    private Singer findSingerById(int singerId) {
        for (int i = 0; i < indexSinger; i++) {
            if (arrSinger[i].getSingerId() == singerId) {
                return arrSinger[i];
            }
        }
        return null;
    }


    public void displayData() {
        System.out.println("Song{" +
                ", songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", singer=" + singer.getSingerName() +
                ", songWriter='" + songWriter + '\'' +
                ", createdDate=" + createdDate +
                ", songStatus=" + songStatus +
                '}');
    }

    public void inputDataEdit(Song[] arrSong, int indexSong, Singer[] arrSinger, int indexSinger) {

        while (true) {
            System.out.println("Nhập tên bài hát");
            this.songName = scanner.nextLine();
            if (this.songName.isEmpty()) {
                System.out.println("Tên bài hát không được để trống");
            } else {
                break;
            }
        }

        System.out.println("Nhập mô tả bài hát");
        this.descriptions = scanner.nextLine();

//        while (true) {
        System.out.println("Danh sách tất cả ca sĩ");
        for (int i = 0; i < indexSinger; i++) {
            arrSinger[i].displayData();
        }

        System.out.println("Nhập mã ca sĩ");
        int singerId = Integer.parseInt(scanner.nextLine());
        this.singer = findSingerById(singerId);
        if (singer == null) {
            System.out.println("Không tìm thấy ca sĩ với mã vừa nhập, vui lòng thêm mới");
            addSinger();
            singer = findSingerById(singerId);
        }

        while (true) {
            System.out.println("Nhập tên nhạc sĩ");
            this.songWriter = scanner.nextLine();
            if (this.songWriter.isEmpty()) {
                System.out.println("Tên nhạc sĩ không được để trống");
            } else {
                break;
            }
        }

        System.out.println("Nhập trạng thái bài hát (true/false)");
        this.songStatus = Boolean.parseBoolean(scanner.nextLine());
    }

}
