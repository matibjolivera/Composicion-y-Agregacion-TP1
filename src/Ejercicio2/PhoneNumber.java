package Ejercicio2;

import Ejercicio1.LineType;

/**
 * The type Phone number.
 */
public class PhoneNumber {

    private int suscriberNumber;
    private int countryCode;
    private Ejercicio1.LineType lineType;

    /**
     * Instantiates a new Phone number.
     *
     * @param suscriberNumber the suscriber number
     * @param countryCode     the country code
     * @param lineType        the line type
     */
    public PhoneNumber(int suscriberNumber, int countryCode, Ejercicio1.LineType lineType) {
        this.suscriberNumber = suscriberNumber;
        this.countryCode = countryCode;
        this.lineType = lineType;
    }

    /**
     * Gets suscriber number.
     *
     * @return the suscriber number
     */
    public int getSuscriberNumber() {
        return suscriberNumber;
    }

    /**
     * Sets suscriber number.
     *
     * @param suscriberNumber the suscriber number
     */
    public void setSuscriberNumber(int suscriberNumber) {
        this.suscriberNumber = suscriberNumber;
    }

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * Sets country code.
     *
     * @param countryCode the country code
     */
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Gets line type.
     *
     * @return the line type
     */
    public Ejercicio1.LineType getLineType() {
        return lineType;
    }

    /**
     * Sets line type.
     *
     * @param lineType the line type
     */
    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return "(+" + this.getCountryCode() + ") " + this.getSuscriberNumber();
    }

    /**
     * Show info.
     */
    public void showInfo() {
        System.out.println(this.getLineType() + ": " + this.getValue());
    }
}
