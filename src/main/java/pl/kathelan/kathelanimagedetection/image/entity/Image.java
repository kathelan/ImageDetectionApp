package pl.kathelan.kathelanimagedetection.image.entity;

import lombok.NonNull;
import javax.persistence.Id;

public class Image {

    @Id
    @NonNull
    private int id;

    @NonNull
    private String fileName;

    @NonNull
    private int fileSize;

    static public class Table {
        public final static String NAME = "IMAGE";
    }

    static public class Entity {
        public final static String NAME = "Image";
    }

    static public class Columns {
        public final static String ID = "ID";
        public final static String FILE_NAME = "FILE_NAME";
        public final static String FILE_SIZE = "FILE_SIZE";
    }
}
