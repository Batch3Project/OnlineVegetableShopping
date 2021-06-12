package com.vegetable.mgmt.service;

import java.util.List;

import com.vegetable.mgmt.entities.Feedback;

public interface IFeedbackService {

	public Feedback addFeedback(Feedback fdk);
	public List<Feedback> viewAllFeedbacks(int vegetableId);

}