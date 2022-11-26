import ru.netology.DzJavaPckCcl5.SQRService.SQRService;

public class main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int number = service.calculate(99,225);
        System.out.println(number);
    }
}