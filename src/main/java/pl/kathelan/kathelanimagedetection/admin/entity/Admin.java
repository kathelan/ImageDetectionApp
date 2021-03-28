package pl.kathelan.kathelanimagedetection.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import javax.persistence.Id;
import java.time.Instant;

@Data
@AllArgsConstructor
@Builder
public class Admin {

    @Id
    @NonNull
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private String password;

    @NonNull
    private boolean superAdmin;

    @NonNull
    private boolean isActive;

    @NonNull
    private Instant creationDate;

    @NonNull
    private Instant updateDate;

    @NonNull
    private boolean removed;

    static public class Table {
        public final static String NAME = "ADMIN";
    }

    static public class Entity {
        public final static String NAME = "Admin";
    }

    static public class Columns {
        public final static String ID = "ID";
        public final static String NAME = "NAME";
        public final static String EMAIL = "EMAIL";
        public final static String PASSWORD = "PASSWORD";
        public final static String SUPER_ADMIN = "SUPER_ADMIN";
        public final static String IS_ACTIVE = "IS_ACTIVE";
        public final static String CREATION_DATE = "CREATION_DATE";
        public final static String UPDATE_DATE = "UPDATE_DATE";
        public final static String REMOVED = "REMOVED";
    }
}
