package com.gdu.app05.domain;

public class Movie {

		private int rank;
		private String movieNm;
		private String openDt;
		private int audiCnt;
		private int audIacc;
		
		public Movie() {}
		
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public String getMovieNm() {
			return movieNm;
		}
		public void setMovieNm(String movieNm) {
			this.movieNm = movieNm;
		}
		public String getOpenDt() {
			return openDt;
		}
		public void setOpenDt(String openDt) {
			this.openDt = openDt;
		}
		public int getAudiCnt() {
			return audiCnt;
		}
		public void setAudiCnt(int audiCnt) {
			this.audiCnt = audiCnt;
		}
		public int getAudIacc() {
			return audIacc;
		}
		public void setAudIacc(int audIacc) {
			this.audIacc = audIacc;
		}
	
}
