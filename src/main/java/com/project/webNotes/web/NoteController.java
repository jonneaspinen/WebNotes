package com.project.webNotes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.webNotes.domain.Note;
import com.project.webNotes.domain.NoteRepo;
import com.project.webNotes.domain.UrgencyRepo;

@Controller
public class NoteController {

	// Autowire repositories
	@Autowired
	private NoteRepo noterepo;
	@Autowired
	private UrgencyRepo urepo;

	// LOGIN
	@RequestMapping(value = { "/login", "/" })
	public String login() {
		return "login";
	}

	// NOTE PAGE, LISTS ALL NOTES

	@RequestMapping(value = { "/notelist" })
	public String NotePage(Model model) {

		// get all notes
		model.addAttribute("listNotes", noterepo.findAll());

		// prepare new note
		model.addAttribute("note", new Note());

		// get all urgencies
		model.addAttribute("urgencies", urepo.findAll());

		return "notelist";
	}

	// SAVE NOTES
	@RequestMapping(value = "/note/save", method = RequestMethod.POST)
	public String noteSave(Note note) {
		noterepo.save(note);

		return "redirect:../notelist";
	}

	// DELETE NOTES
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value = "/deleteNote/{id}", method = RequestMethod.GET)
	public String deleteNote(@PathVariable(value = "id") Long id) {

		// delete note by id
		this.noterepo.deleteById(id);

		return "redirect:../notelist";
	}

	// EDIT NOTES
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value = "/editNote/{id}", method = RequestMethod.GET)
	public String editNote(@PathVariable(value = "id") Long id, Model model) {

		// set model attributes
		model.addAttribute("note", noterepo.findById(id));
		model.addAttribute("urgencies", urepo.findAll());

		return "editnote";
	}
}
