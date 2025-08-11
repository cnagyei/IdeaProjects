
class GameCharacter {
    @NotNull
    private String login;

    @Range(min = 1, max = 100)
    private int level = 1;

    public GameCharacter(
            @NotNull String login,
            @Range(min = 1, max = 100) int level) {

        this.login = login;
        this.level = level;
    }

    @NotNull
    public String getLogin() {
        return login;
    }

    @Range(min = 1, max = 100)
    public int getLevel() {
        return level;
    }
}