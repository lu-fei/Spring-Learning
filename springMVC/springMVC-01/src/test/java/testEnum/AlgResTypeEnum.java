package testEnum;

public enum AlgResTypeEnum {
    /** 单曲 */
    SONGVALID("song"),
    /** video */
    VIDEO("video"),
    /** 歌单 */
    PLAYLIST("playlist"),
    /** 艺人 */
    ARTIST("artist"),
    /** 专辑 */
    ALBUM("album"),
    /** 用户 */
    USER("user"),
    /** 相似query */
    SIMQUERY("sim_query"),
    /** 直播 */
    LIVE("live"),
    /** 云圈 */
    CIRCLE("circle"),
    /** 声音 */
    VOICE("voice"),
    /** 听单 */
    VOICELIST("voicelist"),
    /** 未知 */
    UNKNOWN("unknown");

    /** 索引的名字 */
    private String index;

    AlgResTypeEnum(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public static AlgResTypeEnum of(String index) {
        for (AlgResTypeEnum teslaIndexEnum : AlgResTypeEnum.values()) {
            if (teslaIndexEnum.getIndex().equals(index)) {
                return teslaIndexEnum;
            }
        }
        return UNKNOWN;
    }

    public static void main(String[] args) {
//        for(AlgResTypeEnum x : AlgResTypeEnum.values()){
//            System.out.println("name:\t" + x.name() + ",\tindex:\t" + x.getIndex());
//        }

        System.out.println(AlgResTypeEnum.of("album").getIndex());


    }
}
