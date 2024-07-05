package pe.edu.upeu.syscenterlife.Modelo;

import lombok.Data;

@Data
public class SessionManager {

    static SessionManager instance;
    Long userId;

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }
}