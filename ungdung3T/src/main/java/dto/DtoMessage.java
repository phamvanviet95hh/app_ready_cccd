package dto;

import org.json.JSONException;
import org.json.JSONObject;

public class DtoMessage {
    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static DtoMessage convertToObject(Object[] json){
        DtoMessage message1 = new DtoMessage();
        try {
            int id = (int) ((JSONObject) json[0]).get("id");
            String message = (String) ((JSONObject) json[0]).get("message");
            message1.setId(id);
            message1.setMessage(message);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return message1;
    }
}
