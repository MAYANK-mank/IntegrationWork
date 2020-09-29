package com.capg.moviemgmt.entities;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Show {
	@Id
	@GeneratedValue
	@Column(name="show_id")
	private int showId ;
	private LocalDateTime showStartTime ;
	private LocalDateTime showEndTime ;
	@OneToMany(cascade=CascadeType.ALL)
	//@ElementCollection
	private List<Seat> seatsId;
	private String showName ;
	//@Column(name = "movie_name")
    private String movieName ;
	//@JoinColumn(name = "theaterId", referencedColumnName = "theaterId",insertable = false,updatable = true)
//    private int theaterId;
//    //@JoinColumn(name = "screenId", referencedColumnName = "screenId",insertable = false,updatable = true)
//    private int screenId;
    
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	public List<Seat> getSeatsId() {
		return seatsId;
	}
	public void setSeatsId(List<Seat> seatsId) {
		this.seatsId = seatsId;
	}

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
//	public int getTheaterId() {
//		return theaterId;
//	}
//	public void setTheaterId(int theaterId) {
//		this.theaterId = theaterId;
//	}
//	public int getScreenId() {
//		return screenId;
//	}
//	public void setScreenId(int screenId) {
//		this.screenId = screenId;
//	}
	
    
      
      
}

