import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common'; // Import CommonModule
import { AuthService } from '../../services/auth.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-dashboard',
  template: `
    <h2>Dashboard</h2>
    <div *ngIf="user">
      <p>Username: {{ user.username }}</p>
      <p>Workout Plan: {{ user.workoutPlan }}</p>
      <p>Trainer: {{ user.assignedTrainer }}</p>
      <button (click)="logout()">Logout</button>
      <a href="http://localhost:3000/workouts">View Workouts</a>
    </div>
  `,
  imports: [
    CommonModule
  ],
  standalone: true
})
export class DashboardComponent implements OnInit {
  user: User | null = null;

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    this.user = this.authService.currentUserValue;
  }

  logout(): void {
    this.authService.logout();
  }
}

