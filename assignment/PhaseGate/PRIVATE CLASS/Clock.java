public class Clock{
	public static void main(String [] args){

		private int hour;
		private int minute;
		private int seconds;

	public Clock(int hour, int minute, int seconds){
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;

	}



	public void sethours(int hour){

		if(hour < 0 && hour > 23)

			hour = hours;

		else{

			hours = 0; }
	}

	public void setminutes(int minute){

		if(minute < 0 && minute > 59)

			day = Days;
		else{
			minute = 0; }
	}
	
	public void setseconds(int seconds){
		if(seconds < 0 && seconds > 59)
			seconds = second;
	else{
		second = 0; }

	}

	public gethour(){

		return hour;
	}

	public getminute(){
		return minute;
	}

	public getseconds(){
		return seconds;

	}



	}
}

