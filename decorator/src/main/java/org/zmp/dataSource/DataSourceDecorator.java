package org.zmp.dataSource;

public class DataSourceDecorator implements DataSource {

    private DataSource wrapper;

    /**
     * 默认修饰符
     */
    DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
