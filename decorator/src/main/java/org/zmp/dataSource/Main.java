package org.zmp.dataSource;

public class Main {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        // 初始的对象
        DataSource plain = new FileDataSource("demoFile.txt");
        // 将初始对象层层装饰后的对象
        DataSourceDecorator encoded =
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new FileDataSource("demoFile.txt")));
        encoded.writeData(salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
