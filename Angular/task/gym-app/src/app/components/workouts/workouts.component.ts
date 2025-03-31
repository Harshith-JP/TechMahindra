import { Component, OnInit } from '@angular/core';
import { GymService } from '../../services/gym.service';
import { Workout } from '../../models/workout.model';
import { Observable } from 'rxjs';
import { WorkoutItemComponent } from '../../components/workout-item/workout-item.component';
import { NgIf, NgFor, AsyncPipe } from '@angular/common';
import { catchError, of } from 'rxjs'; // Import catchError and of

@Component({
  selector: 'app-workouts',
  standalone: true,
  imports: [WorkoutItemComponent, NgIf, NgFor, AsyncPipe],
  template: `
    <div class="container mt-5">
      <div class="row justify-content-center">
        <div class="col-md-6">
          <h2 class="text-center">Workouts</h2>
          <div *ngIf="workouts$ | async as workouts" class="list-group">
            <app-workout-item
              *ngFor="let workout of workouts"
              [workout]="workout"
            ></app-workout-item>
          </div>
          <div *ngIf="fetchError" class="alert alert-danger mt-3">
            {{ fetchError }}
          </div>
        </div>
      </div>
    </div>
  `,
})
export class WorkoutsComponent implements OnInit {
  workouts$: Observable<Workout[]> | undefined;
  fetchError: string | null = null; // Add error property

  constructor(private gymService: GymService) {}

  ngOnInit(): void {
    this.workouts$ = this.gymService.getWorkouts().pipe(
      catchError((error) => {
        console.error('WorkoutsComponent: Error fetching workouts', error);
        this.fetchError = 'Failed to load workouts. Please try again.'; // Set error message
        return of([]); // Return an empty array to prevent template errors
      })
    );

    this.workouts$.subscribe((workouts) => {
      console.log('WorkoutsComponent: Received workouts', workouts);
    });
  }
}