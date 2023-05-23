import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowexpiredComponent } from './showexpired.component';

describe('ShowexpiredComponent', () => {
  let component: ShowexpiredComponent;
  let fixture: ComponentFixture<ShowexpiredComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowexpiredComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowexpiredComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
