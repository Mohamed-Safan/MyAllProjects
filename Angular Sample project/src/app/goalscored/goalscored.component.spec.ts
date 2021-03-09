import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GoalscoredComponent } from './goalscored.component';

describe('GoalscoredComponent', () => {
  let component: GoalscoredComponent;
  let fixture: ComponentFixture<GoalscoredComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GoalscoredComponent ]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GoalscoredComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
