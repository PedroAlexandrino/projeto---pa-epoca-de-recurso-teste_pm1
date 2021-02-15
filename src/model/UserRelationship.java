package model;

import java.util.ArrayList;

public class UserRelationship {
    private String userID;
    private String user2ID;

    /**
     * Relationship's Constructor

     * @param users
     * @param relacao
     */
    public UserRelationship(String  users, String relacao) {

        this.userID = users;
        this.user2ID = relacao;
}

    public String getRelacao() {
        return user2ID;
    }
    public String getID() {
        return userID;
    }

    public void setRelacao(String relacao) {
        this.user2ID = relacao;
    }


}
