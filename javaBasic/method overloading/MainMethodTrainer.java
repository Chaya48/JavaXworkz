class MainMethodTrainer{
	static void deliveringTrainingSessions()
	{
		System.out.println(" Trainer delivering Training Sessions");
	}
	static void schedulingTraining()
	{
		System.out.println( "Traineer scheduling Training");
	}
	public static void main(String[] values){
		Trainer.person();
		Trainer.trainer("om");
		Trainer.trainer(13,46777d);
		Trainer.trainerWork("teaching");
		Trainer.trainerSupervise(60);
		Trainer.payAmount(30000f);
		Trainer.plan("complete");
		Trainer.workComplete(90);
		Trainer.teaches("student");
		Trainer.monitor("clients");
		Trainer.adjust("goals");
		deliveringTrainingSessions();
		schedulingTraining();
	}
}