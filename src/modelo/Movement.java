package modelo;

import util1.Date;
import java.io.Serializable;

public class Movement implements Serializable{
    //private int movementId;
    String product;
    String movementType;
    String date;

    public Movement(/*int movementId,*/String product, String movementType, String date) {
        //this.movementId = movementId;
        this.product = product;
        this.movementType = movementType;
        this.date = date;
    }
    /*public int getMovementId() {
        return movementId;
    }
    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }*/
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getMovementType() {
        return movementType;
    }
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
