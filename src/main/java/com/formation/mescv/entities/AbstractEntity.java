package com.formation.mescv.entities;

public interface AbstractEntity {
	/**
	 * Use to personalize id. Do not need to override this method if UUID is good enough
	 */
	default void addGeneratedId() {
	}
}

