import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AiButtonCallComponent } from './ai-button-call.component';

describe('AiButtonCallComponent', () => {
  let component: AiButtonCallComponent;
  let fixture: ComponentFixture<AiButtonCallComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AiButtonCallComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AiButtonCallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
