import { Component, OnInit } from '@angular/core';
import { GymService } from '../../services/gym.service';
import { Workout } from '../../models/workout.model';
import { Observable } from 'rxjs';
import { WorkoutItemComponent } from '../../components/workout-item/workout-item.component';
import { NgIf, NgFor, AsyncPipe } from '@angular/common';

@Component({
  selector: 'app-workouts',
  standalone: true,
  imports: [WorkoutItemComponent, NgIf, NgFor, AsyncPipe],
  template: `
    <h2>Workouts</h2>
    <div *ngIf="workouts$ | async as workouts">
      <app-workout-item
        *ngFor="let workout of workouts"
        [workout]="workout"
      ></app-workout-item>
    </div>
  `,
})
export class WorkoutsComponent implements OnInit {
  workouts$: Observable<Workout[]> | undefined; // Change the type to Observable<Workout[]>

  constructor(private gymService: GymService) {}

  ngOnInit(): void {
    this.workouts$ = this.gymService.getWorkouts();
    this.workouts$.subscribe(
      (workouts) => {
        console.log('WorkoutsComponent received:', workouts);
      },
      (error) => {
        console.error('Error fetching workouts:', error);
      }
    );
  }
}