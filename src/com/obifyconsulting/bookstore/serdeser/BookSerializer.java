package com.obifyconsulting.bookstore.serdeser;

import com.obifyconsulting.bookstore.entity.BookEntity;

import java.io.*;

public class BookSerializer {
    public static void serializeBook(BookEntity bookEntity){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(bookEntity.getBookID()+".ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookEntity);
        }catch(IOException exp){
            exp.printStackTrace();
        }
        finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static BookEntity deserializeBook(Long bookID){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        BookEntity BEnt = null;
        try{
            fis = new FileInputStream(bookID+".ser");
            ois = new ObjectInputStream(fis);
            BEnt = (BookEntity) ois.readObject();
        }catch(ClassNotFoundException exp){
            exp.printStackTrace();
        }
        catch (FileNotFoundException exp){
            System.out.println("The book you are looking does not exist");;
        }
        catch (IOException exp){
            exp.printStackTrace();
        }
        finally {
            try {
                ois.close();
                fis.close();
            } catch (Exception exp) {
                System.out.println("OOPS !!! , Some error occurred");;
            }
        }
        return BEnt;
    }
}
