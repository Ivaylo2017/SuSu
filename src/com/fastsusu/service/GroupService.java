/**
 * 
 */
package com.fastsusu.service;

import java.util.List;

import com.fastsusu.model.Group;

/**
 * @author R
 *
 */
public interface GroupService {
	
	Group findById(int id);
	
	Group findByName(String name);

	void save(Group group, String userName);
	
	List<Group> findUserGroups(String name);
	
	List<Group> findNotAssociatedGroups(String username);
	
	void associateGroup(int groupId, String userName);

}
