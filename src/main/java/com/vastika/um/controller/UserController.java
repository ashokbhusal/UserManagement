package com.vastika.um.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.um.model.User;
import com.vastika.um.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add_user")
	public String getUserForm() {
		return "createUser";
	}
	
	@RequestMapping(value = "/edit_user")
	public String getEditUserForm(@RequestParam int id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "editUser";
	}
	@RequestMapping(value= "/save_user", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:/list_user";
	}
	@RequestMapping(value= "/update_user", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user) {
		userService.updateUser(user);
		return "redirect:/list_user";
	}
	@RequestMapping(value = "/list_user")
	public String getAllUser(Model model) {
		model.addAttribute("users", userService.getAllUser());
		return "listUser";
	}
	
	@RequestMapping(value = "/delete_user", method = RequestMethod.GET)
	public String deleteUser(@RequestParam int id) {
		userService.deleteUser(id);
		return "redirect:/list_user";
	}
}
