import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModeratorpanComponent } from './moderatorpan.component';

describe('ModeratorpanComponent', () => {
  let component: ModeratorpanComponent;
  let fixture: ComponentFixture<ModeratorpanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModeratorpanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModeratorpanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
