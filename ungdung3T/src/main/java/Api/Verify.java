package Api;

public class Verify {
    String ds_cert;
    String id_card;
    String device_type;
    String province;
    String code;

    public Verify(String ds_cert, String id_card, String device_type, String province, String code) {
        this.ds_cert = ds_cert;
        this.id_card = id_card;
        this.device_type = device_type;
        this.province = province;
        this.code = code;
    }
}
