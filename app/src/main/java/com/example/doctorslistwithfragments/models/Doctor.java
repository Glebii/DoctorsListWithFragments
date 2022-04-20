package com.example.doctorslistwithfragments.models;

import java.io.Serializable;

public class Doctor implements Serializable {

        private String name;
        private String room;
        private String imageVIew;
        private String profile;
        private String phone;

        public Doctor(String name,  String room, String imageVIew, String profile,String phone){
            this.name =name;
            this.room = room;
            this.imageVIew = imageVIew;
            this.profile=profile;
            this.phone=phone;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getImageVIew() {
            return imageVIew;
        }

        public void setImageVIew(String imageVIew) {
            this.imageVIew = imageVIew;
        }

         public String getProfile() {
             return profile;
         }

         public void setProfile(String profile) {
            this.profile = profile;
         }

    public String getPhone() {
        return phone;
    }
}
