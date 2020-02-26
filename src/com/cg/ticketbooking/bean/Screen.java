package com.cg.ticketbooking.bean;
public class Screen {
        int screenid;
        int theatreid;
        String screenName;
        String screenType;
        
        public Screen(int screenid,  String screenName ,String screenType) {
        	this.screenid=screenid;
        	this.screenName=screenName;
        	this.screenType=screenType;
        	
        }
        
        public void searchShow() {
        	
         }
        public void showShows() {
        	
         }
       	public int getScreenid() {
			return screenid;
		}
		public String getScreenName() {
			return screenName;
		}
		public void setScreenName(String screenName) {
			this.screenName = screenName;
			
		}	
			
	    public String getScreenType() {
			return screenType;
		}

		}
