understandingjavafxmodality
===========================

Understanding various Modality configuration for JavaFX Stage class.

This application demonstrates various javafx.stage.Modality configurations for javafx.stage.Stage class.

If a Stage object is set Modality.WINDOW_MODAL then this particular Stage would interrupt input events being transferred to
any Window (only) in the hierarchy of this Stage's Owner; an Stage can be assigned an owning Window.

If a Stage object is set Modality.APPLICATION_MODAL then this particular Stage would interrupt input events being transferred to
any Window that is launched from the scope of this application; an Stage can be assigned an owning Window.

Modality.NONE for a Stage allows input events to any and all window that might have been launched. On the same note a 
Stage with no Owner assigned to it would behave would behave as if its Modality has been set to NONE no matter what Modality
be set for it.

Your comments welcomed!!
