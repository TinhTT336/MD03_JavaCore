package ra.run;

import ra.config.Config;
import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class MusicManagement {
    static Scanner scanner = new Scanner(System.in);

    public static Singer[] arrSinger = new Singer[100];

    static {
        arrSinger[0] = new Singer("An An", 18, "Viet Nam", true, "Pop");
        arrSinger[1] = new Singer("Be Be", 20, "Viet Nam", false, "RnB");
        arrSinger[2] = new Singer("Ci Ci", 19, "Viet Nam", false, "Rock");
    }

    public static int indexSinger = 3;


    public static Song[] arrSong = new Song[100];
    public static int indexSong = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");

            System.out.println("*************************************************");
            System.out.println("Nhập lựa chọn của bạn (1-4)");
            choice = Config.getValidateInteger();

            switch (choice) {
                case 1:
                    singerManagement();
                    break;
                case 2:
                    songManagement();
                    break;
                case 3:
                    searchSong();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng nào phù hợp với lựa chọn của bạn, vui lòng chọn lại");
                    break;

            }
        } while (true);
    }

    private static void searchSong() {
        int choice3;
        do {
            System.out.println("************************SEARCH-MANAGEMENT*************************");
            System.out.println("1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2.Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4.Hiển thị 10 bài hát được đăng mới nhất");
            System.out.println("5. Thoát");

            System.out.println("*************************************************");
            System.out.println("Nhập lựa chọn của bạn (1-4)");
            choice3 = Config.getValidateInteger();

            switch (choice3) {
                case 1:
                    findSongBySingerName();
                    break;
                case 2:
                    findSingerByName();
                    break;
                case 3:
                    displaySongIncrease();
                    break;
                case 4:
                    display10NewestSong();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Không có chức năng nào phù hợp với lựa chọn của bạn, vui lòng chọn lại");
                    break;

            }
        } while (true);
    }

    private static void display10NewestSong() {
        for (int i = 0; i < indexSong - 1; i++) {
            for (int j = i + 1; j < indexSong; j++) {
                if ((arrSong[i].getCreatedDate().compareTo(arrSong[j].getCreatedDate())) < 0) {
                    Song temp = arrSong[i];
                    arrSong[i] = arrSong[j];
                    arrSong[j] = temp;
                }
            }
        }

        int count = 0;
        System.out.println();
        for (int i = 0; i < indexSong; i++) {
            if (arrSong[i] != null) {
                arrSong[i].displayData();
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
    }

    private static void displaySongIncrease() {
        for (int i = 0; i < indexSong - 1; i++) {
            for (int j = i + 1; j < indexSong; j++) {
                if ((arrSong[i].getSongName().compareTo(arrSong[j].getSongName()) > 0)) {
                    Song temp = arrSong[i];
                    arrSong[i] = arrSong[j];
                    arrSong[j] = temp;
                }
            }
        }

        System.out.println("Danh sách bài hát sắp xếp theo thứ tự tên tăng dần: ");
        for (int i = 0; i < indexSong; i++) {
            arrSong[i].displayData();
        }
    }

    private static void findSingerByName() {
        System.out.println("Tìm kiếm ca sĩ theo tên ca sĩ");
        String singerName = scanner.nextLine();

        for (int i = 0; i < indexSinger; i++) {
            if (arrSinger[i].getSingerName().toLowerCase().contains(singerName.toLowerCase())) {
                arrSinger[i].displayData();
            }
        }
    }

    private static void findSongBySingerName() {
        System.out.println("Tìm kiếm tên bài hát theo tên ca sĩ");
        System.out.println("Nhập tên ca sĩ");
        String singerName = scanner.nextLine();

        for (int i = 0; i < indexSong; i++) {
            if (arrSong[i].getSinger().getSingerName().toLowerCase().contains(singerName.toLowerCase())) {
                arrSong[i].displayData();
            }
        }
    }

    private static void songManagement() {
        int choice2;
        do {
            System.out.println("************************SONG-MANAGEMENT*************************");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3.Thay đổi thông tin bài hát theo mã id");
            System.out.println("4.Xóa bài hát theo mã id");
            System.out.println("5. Thoát");

            System.out.println("*************************************************");
            System.out.println("Nhập lựa chọn của bạn (1-5)");
            choice2 = Config.getValidateInteger();

            switch (choice2) {
                case 1:
                    addSong();
                    break;
                case 2:
                    displaySong();
                    break;
                case 3:
                    editSong();
                    break;
                case 4:
                    deleteSong();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Không có chức năng nào phù hợp với lựa chọn của bạn, vui lòng chọn lại");
                    break;

            }
        } while (true);

    }

    private static void deleteSong() {
        System.out.println("Nhập mã bài hát muốn xoá");
        String deleteSongId = scanner.nextLine();

        for (int i = 0; i < indexSong; i++) {
            if (arrSong[i].getSongId().equals(deleteSongId)) {
                System.out.println("Bài hát muốn xoá: ");
                arrSong[i].displayData();
                for (int j = i; j < indexSong - 1; j++) {
                    Song temp = arrSong[j];
                    arrSong[j] = arrSong[j + 1];
                    arrSong[j + 1] = temp;
                }
                indexSong--;
                return;
            }
        }
        System.out.println("Không tìm thấy bài hát với mã vừa nhập");
    }

    private static void editSong() {
        System.out.println("Nhập mã bài hát muốn chỉnh sửa");
        String editSongId = scanner.nextLine();

        for (int i = 0; i < indexSong; i++) {
            if (arrSong[i].getSongId().equals(editSongId)) {
                arrSong[i].displayData();
                arrSong[i].inputDataEdit(arrSong, indexSong, arrSinger, indexSinger);
                System.out.println("Đã cập nhật thông tin bài hát");
                return;
            }
        }
        System.out.println("Không tìm thấy bài hát với mã vừa nhập");
    }

    private static void displaySong() {
        for (int i = 0; i < indexSong; i++) {
            arrSong[i].displayData();
        }

    }

    private static void addSong() {
        System.out.println("Nhập số lượng bài hát muốn thêm mới");
        int n = Config.getValidateInteger();

        for (int i = 0; i < n; i++) {
            System.out.println("Thêm mới bài hát thứ " + (i + 1));
            arrSong[indexSong] = new Song();
            arrSong[indexSong].inputData(arrSong, indexSong, arrSinger, indexSinger);
            indexSong++;
        }
    }

    private static void singerManagement() {
        int choice1;
        do {
            System.out.println("************************SINGER-MANAGEMENT*************************");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3.Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)");
            System.out.println("5. Thoát");

            System.out.println("*************************************************");
            System.out.println("Nhập lựa chọn của bạn (1-5)");
            choice1 = Config.getValidateInteger();

            switch (choice1) {
                case 1:
                    addSinger();
                    break;
                case 2:
                    displaySinger();
                    break;
                case 3:
                    editSinger();
                    break;
                case 4:
                    deleteSinger();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Không có chức năng nào phù hợp với lựa chọn của bạn, vui lòng chọn lại");
                    break;

            }
        } while (true);


    }

    private static void deleteSinger() {
        System.out.println("Nhập mã ca sĩ muốn xoá");
        int deleteSingerId =Config.getValidateInteger();

        for (int i = 0; i < indexSinger; i++) {
            if (arrSinger[i].getSingerId() == deleteSingerId) {

                boolean hasSong = false;
                for (int j = 0; j < indexSong; j++) {
                    if (arrSong[j] != null && arrSong[j].getSinger().getSingerId() == deleteSingerId) {
                        hasSong = true;
                        break;
                    }
                }

                if (hasSong) {
                    System.out.println("Không được xoá  sĩ có bài hát");
                } else {
                    for (int k = i; k < indexSinger - 1; k++) {
                        arrSinger[k] = arrSinger[k + 1];
                    }
                    indexSinger--;
                    System.out.println("Xoá thành công");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy ca sĩ với mã vừa nhập");
    }

    private static void editSinger() {
        System.out.println("Nhập mã ca sĩ muốn chỉnh sửa");
        int editSingerId = Config.getValidateInteger();

        for (int i = 0; i < indexSinger; i++) {
            if (arrSinger[i].getSingerId() == editSingerId) {
                arrSinger[i].displayData();
                arrSinger[i].inputData();
            }
        }
    }

    private static void displaySinger() {
        for (int i = 0; i < indexSinger; i++) {
            arrSinger[i].displayData();
        }
    }

    public static void addSinger() {
        System.out.println("Nhập số lượng ca sĩ muốn thêm mới");
        int n = Config.getValidateInteger();
        for (int i = 0; i < n; i++) {
            System.out.println("Thêm mới ca sĩ thứ " + (i + 1));
            arrSinger[indexSinger] = new Singer();
            arrSinger[indexSinger].inputData();
            indexSinger++;
        }
    }

}
