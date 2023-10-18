package ra.baitap.trienkhaiqueue;

public class Queue {
    Node front;
    Node rear;


    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //    Rear là phần tử được đưa vào cuối cùng trong hàng đợi
//
//Front là phần tử được đưa vào đầu tiên trong hàng đợi
//
//enQueue là hàm thực hiện chèn 1 phần tử. Trong hàng đợi liên kết vòng , luôn được chèn vào vị trí Rear.Thao tác chèn sẽ gồm các bước sau:
//
//B1: Tạo node mới, thêm giá trị vào node
//
//B2: Kiểm tra hàng đợi trống hay không. Nếu true thì front = rear = node vừa tạo, nếu false rear = node vừa tạo, và node rear luôn chứa địa chỉ của node front
//
//deQueue là hàm thực hiện lấy ra 1 phần tử.Trong hàng đợi liên kết vòng, luôn lấy ra vị trị Front.
//B1: Kiểm tra hàng đợi trống hay không (có nghĩa Front == null)
//
//B2: Nếu trống, thì trả về kết quả null, nếu không thực hiện B3
//
//B3: Kiểm tra Front == Rear hay không. Nếu true gán Front = Rear = null,
// nếu không gán Front vào node liền sau, trỏ địa chỉ Front trong node Rear tới node Front mới trỏ.
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            newNode.setLink(front);  //node rear luôn chứa địa chỉ của node front
        } else {
            rear.setLink(newNode);
            rear = newNode;
            rear.setLink(front);
        }
    }

    public Node deQueue() {
        if (front == null) {
            return null; //hàng đợi trống  (có nghĩa Front == null) trả về kết quả null
        } else {
            Node data = front;
            if (front == rear) {
                front = rear = null; //Kiểm tra Front == Rear hay không. Nếu true gán Front = Rear = null
            } else {
                front = front.getLink();//gán Front vào node liền sau
                rear.setLink(front); //trỏ địa chỉ Front trong node Rear tới node Front mới trỏ
            }
            return data;
        }
    }

    public void displayQueue() {

    }
}
