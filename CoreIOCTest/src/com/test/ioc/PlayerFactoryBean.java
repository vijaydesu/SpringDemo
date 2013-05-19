/**
 * 
 */
package com.test.ioc;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @author Admin
 *
 */
public class PlayerFactoryBean extends AbstractFactoryBean<Player> {
	
	private Player player;
	
	private Integer increaseBy;

	@Override
	protected Player createInstance() throws Exception {
		// TODO Auto-generated method stub
		 player.setId(player.getId() + increaseBy.intValue());
		return player;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return player.getClass();
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return the increaseBy
	 */
	public Integer getIncreaseBy() {
		return increaseBy;
	}

	/**
	 * @param increaseBy the increaseBy to set
	 */
	public void setIncreaseBy(Integer increaseBy) {
		this.increaseBy = increaseBy;
	}

}
