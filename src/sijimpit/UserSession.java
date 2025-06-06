/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sijimpit;

/**
 *
 * @author Aini Intan Saylendra
 */
public class UserSession {
    private static Integer loggedInUserId;
    private static String loggedInUserName;
    private static String loggedInUserNik; // Pastikan ini juga ada

    public static void setLoggedInUser(Integer userId, String userName, String userNik) {
        loggedInUserId = userId;
        loggedInUserName = userName;
        loggedInUserNik = userNik;
    }

    public static Integer getLoggedInUserId() {
        return loggedInUserId;
    }

    public static String getLoggedInUserName() {
        return loggedInUserName;
    }

    public static String getLoggedInUserNik() {
        return loggedInUserNik;
    }

    public static void clearSession() {
        loggedInUserId = null;
        loggedInUserName = null;
        loggedInUserNik = null;
    }
}
