import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms'; // Import FormsModule
import { AuthService } from '../../services/auth.service';
import { Router } from '@angular/router';
import { User } from '../../models/user.model'; // Import the User model

@Component({
  selector: 'app-quiz',
  template: `
    <h2>Gym Quiz</h2>
    <p>How many times a week do you workout?</p>
    <select [(ngModel)]="answer">
      <option value="1">1-2 times</option>
      <option value="2">3-4 times</option>
      <option value="3">5+ times</option>
    </select>
    <button (click)="submitQuiz()">Submit Quiz</button>
  `,
  imports: [
    FormsModule // Include FormsModule in the imports array
  ],
  standalone: true // Add this line if your component is standalone
})
export class QuizComponent {
  answer: string = '1';

  constructor(private authService: AuthService, private router: Router) {}

  submitQuiz(): void {
    const score = parseInt(this.answer, 10);
    const workoutPlan =
      score <= 1 ? 'Beginner' : score <= 2 ? 'Intermediate' : 'Advanced';
    const trainer = score <= 1 ? 'A' : score <= 2 ? 'B' : 'C';

    const currentUser: User | null = this.authService.currentUserValue; // Get the current user

    if (currentUser) {
      this.authService.updateUser({
        username: currentUser.username, // Include the username
        quizScore: score,
        workoutPlan: workoutPlan,
        assignedTrainer: trainer,
      });
      this.router.navigate(['/dashboard']);
    }
  }
}
