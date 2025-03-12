import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Workout } from '../models/workout.model';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class GymService {
  private apiUrl = 'api.json';

  constructor(private http: HttpClient) {}

  getWorkouts(): Observable<Workout[]> { // Change return type to Observable<Workout[]>
    return this.http.get<any>(this.apiUrl).pipe(
      map((data: any) => {
        console.log('Workout data from API:', data.workouts);
        return data.workouts; // Return an array of workouts
      })
    );
  }
}