package com.tensquare.base.pojo;

/**
 * 天气的ben ,m n n jm
 */
public class Entity {


    /**
     * weatherinfo : {"city":"鐣","cityid":"101280102","temp":"27.9","WD":"涓滈","WS":"灏忎簬3绾�","SD":"84%","AP":"1004.1hPa","njd":"鏆傛棤瀹炲喌","WSE":"<3","time":"17:50","sm":"1.5","isRadar":"0","Radar":""}
     */

    private WeatherinfoBean weatherinfo;
    private WeatherinfoBean ccc;

    public WeatherinfoBean getWeatherinfo() {
        return weatherinfo;
    }

    public void setWeatherinfo(WeatherinfoBean weatherinfo) {
        this.weatherinfo = weatherinfo;
    }

    /*
     *,.
     */

    public static class WeatherinfoBean {
        /**
         * city : 鐣
         * cityid : 101280102
         * temp : 27.9
         * WD : 涓滈
         * WS : 灏忎簬3绾�
         * SD : 84%
         * AP : 1004.1hPa
         * njd : 鏆傛棤瀹炲喌
         * WSE : <3
         * time : 17:50
         * sm : 1.5
         * isRadar : 0
         * Radar :
         */

        private String city;
        private String cityid;
        private String temp;
        private String WD;
        private String WS;
        private String SD;
        private String AP;
        private String njd;
        private String WSE;
        private String time;
        private String sm;
        private String isRadar;
        private String Radar;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getWD() {
            return WD;
        }

        public void setWD(String WD) {
            this.WD = WD;
        }

        public String getWS() {
            return WS;
        }

        public void setWS(String WS) {
            this.WS = WS;
        }

        public String getSD() {
            return SD;
        }

        public void setSD(String SD) {
            this.SD = SD;
        }

        public String getAP() {
            return AP;
        }

        public void setAP(String AP) {
            this.AP = AP;
        }

        public String getNjd() {
            return njd;
        }

        public void setNjd(String njd) {
            this.njd = njd;
        }

        public String getWSE() {
            return WSE;
        }

        public void setWSE(String WSE) {
            this.WSE = WSE;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }

        public String getIsRadar() {
            return isRadar;
        }

        public void setIsRadar(String isRadar) {
            this.isRadar = isRadar;
        }

        public String getRadar() {
            return Radar;
        }

        public void setRadar(String Radar) {
            this.Radar = Radar;
        }
    }
}
