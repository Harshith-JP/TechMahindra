export interface User {
    id?: number;
    username: string;
    password?: string;
    isRegistered?: boolean;
    quizScore?: number;
    workoutPlan?: string;
    assignedTrainer?: string;
  }
  