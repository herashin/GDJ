package java01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
	@Configuration
	안녕. 난 Bean을 만드는 Java 파일이야.
	Spring Bean Configuration File하고 하는일이 같지.
*/

@Configuration
public class SpringBeanConfig {
	
	// 메소드 하나당 Bean 하나를 맡아서 생성한다
	/*
		@bean
		안녕. 난 Bean을 만드는 메소드야.
		메소드이름이 Bean의 이름(id)이고,
		반환타입이 Bean의 타입(class)야.	
	*/
	/*
	  <bean id="song" class="Song">
	  		<property name="title" value="제목" />
	  		<property name="genre" value="장르" />
	  </bean>
	*/
	
	@Bean
	public Song song1() {
		Song song = new Song();
		song.setTitle("제목1");
		song.setGenre("장르1");
		return song;
	}
	
	/*
	  <bean id="song2" class="Song">
	  		<property name="title" value="제목2" />
	  		<property name="genre" value="장르2" />
	  </bean>
	*/
	@Bean(name="song2")		// @bean에 name값을 지정하면
	public Song dasdsada() {//메소드이름은 아무거나 적어도 된다.
		Song song = new Song();
		song.setTitle("제목2");
		song.setGenre("장르2");
		return song;
	}
	
	/*
	  <bean id="song3" class="Song">
	  		<constroctor-arg  value="제목3" />
	  		<constroctor-arg  value="장르3" />
	  </bean>
	*/
	@Bean
	public Song song3() {
		return new Song("제목3", "장르3");
	}
	
	// 미션
	// song1를 가지는 singer1을 만들어 보자.
	// setter injection
	
	@Bean
	public Singer singer1() {
		Singer singer = new Singer();
		singer.setName("가수1");
		singer.setSong(song1());
		return singer;
	}
	
	
	@Bean(name="singer2")
	public Singer dsdw() {
		Singer singer = new Singer();
		singer.setName("가수2");
		singer.setSong(dasdsada());
		return singer;
	}
	
	@Bean
	public Singer singer3() {
		return new Singer("가수3", song3());
	}
	
	
}
