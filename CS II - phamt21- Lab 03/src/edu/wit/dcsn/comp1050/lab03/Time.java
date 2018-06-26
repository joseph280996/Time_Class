package edu.wit.dcsn.comp1050.lab03 ;

/*
 * Tung Pham
 * Comp 1050 - Computer Science II
 * Lab 3: Time
 * Summer, 2018
 * 
 * NOTICE:  You are not permitted to post this on any public forum or share with anyone outside 
 * of this class.
 */

/**
 * Consider a class Time that represents a time of day.  It has attributes for the hour and minute.
 * The hour value ranges from 0 to 23, where the range 0 to 11 represents a time before noon.  The 
 * minute value ranges from 0 to 59.
 * 
 * @author David M Rosenberg
 * @author Tung Pham
 * @version 2
 */
public class Time implements Comparable< Time >
	{
	/*
	 * instance variables
	 */
	private int	hours ;            // 24-hour clock - in the range 0..23 inclusive
	private int	minutes ;          // in the range 0..59 inclusive
	
	
	/*
	 * constructors
	 */
	
	/**
	 * Creates and initializes a Time object to 12:00 midnight
	 */
	public Time()
		{
		hours =                   0 ;
		minutes =                 0 ;
		}	// end no-arg constructor
	
	
    /**
     * Creates and initializes a Time object given the time in 24-hour format
     * 
     * @param initialHours 24-hour format in the range 0..23
     * @param initialMinutes minutes in the range 0..59
     *            <p>
     *            postconditions: if the specified hours and minutes are
     *            in-range, the object will reflect those value but the time
     *            will be set to 0 hours and 0 minutes (12:00 midnight) if
     *            either or both values are out-of-range
     */
	public Time(	int initialHours,
					int initialMinutes )
		{
		this();
		this.setTime(initialHours,initialMinutes); //call 2-args setTime
		}// end 2-arg constructor
	
    /**
     * Creates and initializes a Time object given the time in 12-hour format
     * 
     * @param initialHours whole number in the range 1..12 inclusive
     * @param initialMinutes whole number in the range 0..59 inclusive
     * @param isAM true: AM; false: PM
     *            <p>
     *            postconditions: if the specified hours and minutes are
     *            in-range, the object will reflect those value but the time
     *            will be set to 0 hours and 0 minutes (12:00 midnight) if
     *            either or both values are out-of-range
     */
	public Time(	int initialHours,
					int initialMinutes,
					boolean isAM )
		{
			this();
			this.setTime(initialHours, initialMinutes,isAM);//call 3-args setTime
		}	// end 3-arg constructor
		
	
	/*
	 * public methods
	 */

	/**
	 * Formats the current Time in 12-hour format
	 * @return [h]h:mm {am | pm}
	 */
	public String getTime12()
		{
				return String.format("%d:%s %s",((this.hours==0||this.hours==12)? //Check if hour is 0 or 12
						12:((this.hours>12)?this.hours-12:this.hours)),//Convert hour to string
						((this.minutes<10)? //Perform check for minutes, if minutes<10
								("0".concat(Integer.toString(this.minutes))): //Concatenate 0 to minutes converted to string
									(Integer.toString(this.minutes))), //else if minutes>10, just convert minutes to string
						(this.hours<12)?"am":"pm");//Determine if AM or PM and parse to formatted string and return.
		}	// end getTime12()
	
	
	/**
     * Formats the current Time in 24-hour format
     * @return hhmm where hours and minutes are always 2-digits each with leading 0-fill if needed
     */
	public String getTime24()
		{
			return String.format("%02d%02d", //Formatted String
					this.hours, //Check to put 0 before hours
					this.minutes);//Check to put 0 before minutes
		}
	
    /**
     * Verify that the hours and minutes are in-range (24-hour format)
     * @param timeHours 24-hour format in the range 0..23
     * @param timeMinutes minutes in the range 0..59
     * @return true if both parameters are within their respective valid ranges, false otherwise
     */
    boolean isValid(	int timeHours,
                    	int timeMinutes )
        {
        	return ((timeHours>=0 && timeHours<=23) && (timeMinutes>=0 && timeMinutes<=59));//check if hours in range 0-23 and minute in range 0-59
        }
    
    
	/**
	 * Set the current time given the time in 24-hour format
	 * @param newHours 24-hour format in the range 0..23
	 * @param newMinutes minutes in the range 0..59
	 */
	public void setTime(	int newHours,
							int newMinutes )
		{
		// STUB
			if (isValid(newHours,newMinutes)) { //Check for validation
				//Assign hours and minutes to this object's hours and minutes
				this.hours = newHours ;
				this.minutes = newMinutes ;
			}
		}	// end 2-arg setTime()
	
	
	/**
	 * Set the current time given the time in 12-hour format
	 * @param newHours 12-hour format in the range 1..12
	 * @param newMinutes minutes in the range 0..59
     * @param isAM true: AM; false: PM
	 */
	public void setTime(	int newHours,
							int newMinutes,
							boolean isAM )
		{
			if (isValid(newHours-1,newMinutes) && isValid(newHours+11,newMinutes)) { //Check if user's input is correct
			//Assign value of hour corresponding to isAM
			//If isAM true, assign new hours to this object's hours.
			//Else assign newHours+12
					this.hours=(isAM)?((newHours==12)?0:newHours):((newHours==12)?12:newHours+12);//Check if 12 to assign hour with 12 
					this.minutes=newMinutes; //Update minute
			}
		}	// end 3-arg setTime()

	
	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo( Time otherTime )
        {
    	return (otherTime.hours > this.hours) ? -1 : //check if otherTime's hours is larger than this object's hours, if true then return 1
    		((otherTime.hours == this.hours && otherTime.minutes > this.minutes) ? -1 : // else if otherTime's hour is equal but minutes is greater, if true then return 1
    			((otherTime.hours == this.hours && otherTime.minutes == this.minutes) ? 0 : 1 )); // else check if both object has same time, if true then return 0, if not then it's smaller so return -1
        }
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object otherThing )
    	{
    	if (otherThing==null) { //check if the reference is null
    		return false;
    	}
    	if (otherThing==this) { //check if the otherThing's reference is equals to this object
    		return true;
    	}
    	if (otherThing instanceof Time) { //check if the object is an instance of Time
    		return ((Time) otherThing).hours==this.hours && ((Time)otherThing).minutes==this.minutes; //cast otherThing to Time and compares its time to this object's time
    	}
    	return false;
    	}	// end equals()
	

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString()
		{
		return String.format("(%02d, %02d)", //Formatted String
				this.hours, //Check if add 0 before hour
				this.minutes);//Check if add 0 before minutes
		}	// end toString()

	}	// end class Time
