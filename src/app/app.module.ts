import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DndModule } from 'ng2-dnd';
import { CountryExerciseComponent } from './country-exercise/country-exercise.component';
import { CountryExerciseService } from './country-exercise/country-exercise.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    CountryExerciseComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    DndModule.forRoot()
  ],
  providers: [
    CountryExerciseService,
    HttpClient
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
