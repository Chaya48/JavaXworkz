package com.xworkz.crud.app.Service;

import com.xworkz.crud.app.repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService {

	private TrainNoRepository trainNoRepository;

public TrainNoServiceImpl(TrainNoRepository trainNoRepository) {
this.trainNoRepository=trainNoRepository;
}
	@Override
	public boolean validateAndSave(String train) {
		System.out.println("invoking validateAndSave from " + this.getClass().getSimpleName());
		if (train != null && !train.isEmpty() && train.length() <= 20) {
			if (!this.trainNoRepository.isExist(train)) {
				System.out.println("juice is" + train);
				this.trainNoRepository.identify(train);
				return true;
			} else {
				System.err.println("location is already stored");
			}
		} else {
			System.err.println("location data is invalid");
		}
		return false;
	}

}
