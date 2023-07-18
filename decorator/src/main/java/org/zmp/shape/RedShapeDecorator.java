package org.zmp.shape;

public class RedShapeDecorator extends ShapeDecorator {

    /**
     * 构造器是私有的，同包的类才能使用这个类
     */
    protected RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        // 进行装饰
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
