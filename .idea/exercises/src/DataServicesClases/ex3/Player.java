package DataServicesClases.ex3;

public class Player {
    private String nickName;
    private String role;
    private Gear gear;

    public Player(String nickName, String role, Gear gear) {
        this.nickName = nickName;
        this.role = role;
        this.gear = gear;
    }

    public Player(String nickName) {
        this.nickName = nickName;
    }

    public Player() {

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
