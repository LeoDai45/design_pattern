package com.leo.creational.abstractFactory.factory;

/**
 * @author Leo
 * @date 2023/4/20 17:07
 */
public abstract class Factory {
    public static Factory getFactory(String className){
        Factory factory = null ;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到" +className + "类.");
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}
