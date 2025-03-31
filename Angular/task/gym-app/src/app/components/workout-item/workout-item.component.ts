import { Component, Input, OnInit } from '@angular/core';
import { Workout } from '../../models/workout.model';
import { DurationPipe } from '../../duration.pipe';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common'; // Import CommonModule

@Component({
  selector: 'app-workout-item',
  standalone: true,
  imports: [DurationPipe, RouterLink, CommonModule], // Add CommonModule to imports
  template: `
    <a
      *ngIf="workout"
      [routerLink]="['/workout-details', workout.id]"
      class="list-group-item list-group-item-action"
    >
      <div class="d-flex w-100 justify-content-between">
        <h5 class="mb-1">{{ workout.name }}</h5>
        <small class="text-muted">
          Duration: {{ workout.duration | duration }}
        </small>
      </div>
    </a>
    <div *ngIf="!workout" class="list-group-item">
      Workout data not available.
    </div>
  `,
})
export class WorkoutItemComponent implements OnInit {
  @Input() workout: Workout | undefined;

  ngOnInit(): void {
    if (!this.workout) {
      console.warn('WorkoutItemComponent: workout input is undefined.');
    }
  }
}