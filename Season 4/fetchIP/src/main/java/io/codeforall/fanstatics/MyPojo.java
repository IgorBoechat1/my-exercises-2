package io.codeforall.fanstatics;

public class MyPojo {


        private String ip;
        private String city;
        private String region;
        private String country;
        private String loc;
        private String org;
        private String postal;
        private String timezone;
        private String readme;

        public String getLoc() {
            return loc;
        }

        public String getOrg() {
            return org;
        }

        public String getPostal() {
            return postal;
        }

        public String getTimezone() {
            return timezone;
        }

        public String getReadme() {
            return readme;
        }

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public void setOrg(String org) {
            this.org = org;
        }

        public void setPostal(String postal) {
            this.postal = postal;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public void setReadme(String readme) {
            this.readme = readme;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "IpInfo{" +
                    "ip='" + ip + '\'' +
                    ", city='" + city + '\'' +
                    ", region='" + region + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

