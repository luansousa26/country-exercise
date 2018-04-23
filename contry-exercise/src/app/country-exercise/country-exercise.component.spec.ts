import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CountryExerciseComponent } from './country-exercise.component';

describe('CountryExerciseComponent', () => {
  let component: CountryExerciseComponent;
  let fixture: ComponentFixture<CountryExerciseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CountryExerciseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CountryExerciseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
