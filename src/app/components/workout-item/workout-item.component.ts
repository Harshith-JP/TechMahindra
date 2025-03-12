import { Component, Input } from '@angular/core';
import { Workout } from '../../models/workout.model';
import { DurationPipe } from '../../duration.pipe';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-workout-item',
  standalone: true,
  imports: [DurationPipe, RouterLink],
  template: `
    <div class="workout-item">
      <a [routerLink]="['/workout-details', workout?.id]">
        <h3>{{ workout?.name }}</h3>
        <p>Duration: {{ workout?.duration | duration }}</p>
      </a>
    </div>
  `,
})
export class WorkoutItemComponent {
  @Input() workout: Workout | undefined;
}