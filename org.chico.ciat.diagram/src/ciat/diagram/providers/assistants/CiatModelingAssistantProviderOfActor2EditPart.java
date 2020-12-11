/*
 * 
 */
package ciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ciat.diagram.edit.parts.Actor2EditPart;
import ciat.diagram.edit.parts.Actor3EditPart;
import ciat.diagram.edit.parts.Actor4EditPart;
import ciat.diagram.edit.parts.ActorEditPart;
import ciat.diagram.edit.parts.Group2EditPart;
import ciat.diagram.edit.parts.Group3EditPart;
import ciat.diagram.edit.parts.Group4EditPart;
import ciat.diagram.edit.parts.GroupEditPart;
import ciat.diagram.edit.parts.Rol2EditPart;
import ciat.diagram.edit.parts.Rol3EditPart;
import ciat.diagram.edit.parts.Rol4EditPart;
import ciat.diagram.edit.parts.RolEditPart;
import ciat.diagram.edit.parts.SoftwareAgent2EditPart;
import ciat.diagram.edit.parts.SoftwareAgent3EditPart;
import ciat.diagram.edit.parts.SoftwareAgent4EditPart;
import ciat.diagram.edit.parts.SoftwareAgentEditPart;
import ciat.diagram.edit.parts.Team2EditPart;
import ciat.diagram.edit.parts.Team3EditPart;
import ciat.diagram.edit.parts.Team4EditPart;
import ciat.diagram.edit.parts.TeamEditPart;
import ciat.diagram.providers.CiatElementTypes;
import ciat.diagram.providers.CiatModelingAssistantProvider;

/**
 * @generated
 */
public class CiatModelingAssistantProviderOfActor2EditPart extends CiatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Actor2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Actor2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CiatElementTypes.Inheritance_4001);
		types.add(CiatElementTypes.Acting_4002);
		types.add(CiatElementTypes.Association_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Actor2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Actor2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RolEditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof SoftwareAgentEditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Rol2EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Actor2EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof SoftwareAgent2EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Team2EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Rol3EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Actor3EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof SoftwareAgent3EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Team3EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Rol4EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Actor4EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof SoftwareAgent4EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Team4EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Group4EditPart) {
			types.add(CiatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof RolEditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof SoftwareAgentEditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Rol2EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Actor2EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof SoftwareAgent2EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Team2EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Rol3EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Actor3EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof SoftwareAgent3EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Team3EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Rol4EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Actor4EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof SoftwareAgent4EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Team4EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Group4EditPart) {
			types.add(CiatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof RolEditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SoftwareAgentEditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof TeamEditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Rol2EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Actor2EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SoftwareAgent2EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Team2EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Rol3EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Actor3EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SoftwareAgent3EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Team3EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Rol4EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Actor4EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof SoftwareAgent4EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Team4EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Group4EditPart) {
			types.add(CiatElementTypes.Association_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Actor2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Actor2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CiatElementTypes.Inheritance_4001) {
			types.add(CiatElementTypes.Rol_3001);
			types.add(CiatElementTypes.Actor_3002);
			types.add(CiatElementTypes.SoftwareAgent_3003);
			types.add(CiatElementTypes.Team_3004);
			types.add(CiatElementTypes.Group_3005);
			types.add(CiatElementTypes.Rol_3007);
			types.add(CiatElementTypes.Actor_3008);
			types.add(CiatElementTypes.SoftwareAgent_3009);
			types.add(CiatElementTypes.Team_3010);
			types.add(CiatElementTypes.Group_3011);
			types.add(CiatElementTypes.Rol_3015);
			types.add(CiatElementTypes.Actor_3016);
			types.add(CiatElementTypes.SoftwareAgent_3017);
			types.add(CiatElementTypes.Team_3018);
			types.add(CiatElementTypes.Group_3019);
			types.add(CiatElementTypes.Rol_3022);
			types.add(CiatElementTypes.Actor_3023);
			types.add(CiatElementTypes.SoftwareAgent_3024);
			types.add(CiatElementTypes.Team_3025);
			types.add(CiatElementTypes.Group_3026);
		} else if (relationshipType == CiatElementTypes.Acting_4002) {
			types.add(CiatElementTypes.Rol_3001);
			types.add(CiatElementTypes.Actor_3002);
			types.add(CiatElementTypes.SoftwareAgent_3003);
			types.add(CiatElementTypes.Team_3004);
			types.add(CiatElementTypes.Group_3005);
			types.add(CiatElementTypes.Rol_3007);
			types.add(CiatElementTypes.Actor_3008);
			types.add(CiatElementTypes.SoftwareAgent_3009);
			types.add(CiatElementTypes.Team_3010);
			types.add(CiatElementTypes.Group_3011);
			types.add(CiatElementTypes.Rol_3015);
			types.add(CiatElementTypes.Actor_3016);
			types.add(CiatElementTypes.SoftwareAgent_3017);
			types.add(CiatElementTypes.Team_3018);
			types.add(CiatElementTypes.Group_3019);
			types.add(CiatElementTypes.Rol_3022);
			types.add(CiatElementTypes.Actor_3023);
			types.add(CiatElementTypes.SoftwareAgent_3024);
			types.add(CiatElementTypes.Team_3025);
			types.add(CiatElementTypes.Group_3026);
		} else if (relationshipType == CiatElementTypes.Association_4003) {
			types.add(CiatElementTypes.Rol_3001);
			types.add(CiatElementTypes.Actor_3002);
			types.add(CiatElementTypes.SoftwareAgent_3003);
			types.add(CiatElementTypes.Team_3004);
			types.add(CiatElementTypes.Group_3005);
			types.add(CiatElementTypes.Rol_3007);
			types.add(CiatElementTypes.Actor_3008);
			types.add(CiatElementTypes.SoftwareAgent_3009);
			types.add(CiatElementTypes.Team_3010);
			types.add(CiatElementTypes.Group_3011);
			types.add(CiatElementTypes.Rol_3015);
			types.add(CiatElementTypes.Actor_3016);
			types.add(CiatElementTypes.SoftwareAgent_3017);
			types.add(CiatElementTypes.Team_3018);
			types.add(CiatElementTypes.Group_3019);
			types.add(CiatElementTypes.Rol_3022);
			types.add(CiatElementTypes.Actor_3023);
			types.add(CiatElementTypes.SoftwareAgent_3024);
			types.add(CiatElementTypes.Team_3025);
			types.add(CiatElementTypes.Group_3026);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Actor2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Actor2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CiatElementTypes.Inheritance_4001);
		types.add(CiatElementTypes.Acting_4002);
		types.add(CiatElementTypes.Association_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Actor2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Actor2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CiatElementTypes.Inheritance_4001) {
			types.add(CiatElementTypes.Rol_3001);
			types.add(CiatElementTypes.Actor_3002);
			types.add(CiatElementTypes.SoftwareAgent_3003);
			types.add(CiatElementTypes.Team_3004);
			types.add(CiatElementTypes.Group_3005);
			types.add(CiatElementTypes.Rol_3007);
			types.add(CiatElementTypes.Actor_3008);
			types.add(CiatElementTypes.SoftwareAgent_3009);
			types.add(CiatElementTypes.Team_3010);
			types.add(CiatElementTypes.Group_3011);
			types.add(CiatElementTypes.Rol_3015);
			types.add(CiatElementTypes.Actor_3016);
			types.add(CiatElementTypes.SoftwareAgent_3017);
			types.add(CiatElementTypes.Team_3018);
			types.add(CiatElementTypes.Group_3019);
			types.add(CiatElementTypes.Rol_3022);
			types.add(CiatElementTypes.Actor_3023);
			types.add(CiatElementTypes.SoftwareAgent_3024);
			types.add(CiatElementTypes.Team_3025);
			types.add(CiatElementTypes.Group_3026);
		} else if (relationshipType == CiatElementTypes.Acting_4002) {
			types.add(CiatElementTypes.Rol_3001);
			types.add(CiatElementTypes.Actor_3002);
			types.add(CiatElementTypes.SoftwareAgent_3003);
			types.add(CiatElementTypes.Team_3004);
			types.add(CiatElementTypes.Group_3005);
			types.add(CiatElementTypes.Rol_3007);
			types.add(CiatElementTypes.Actor_3008);
			types.add(CiatElementTypes.SoftwareAgent_3009);
			types.add(CiatElementTypes.Team_3010);
			types.add(CiatElementTypes.Group_3011);
			types.add(CiatElementTypes.Rol_3015);
			types.add(CiatElementTypes.Actor_3016);
			types.add(CiatElementTypes.SoftwareAgent_3017);
			types.add(CiatElementTypes.Team_3018);
			types.add(CiatElementTypes.Group_3019);
			types.add(CiatElementTypes.Rol_3022);
			types.add(CiatElementTypes.Actor_3023);
			types.add(CiatElementTypes.SoftwareAgent_3024);
			types.add(CiatElementTypes.Team_3025);
			types.add(CiatElementTypes.Group_3026);
		} else if (relationshipType == CiatElementTypes.Association_4003) {
			types.add(CiatElementTypes.Rol_3001);
			types.add(CiatElementTypes.Actor_3002);
			types.add(CiatElementTypes.SoftwareAgent_3003);
			types.add(CiatElementTypes.Team_3004);
			types.add(CiatElementTypes.Group_3005);
			types.add(CiatElementTypes.Rol_3007);
			types.add(CiatElementTypes.Actor_3008);
			types.add(CiatElementTypes.SoftwareAgent_3009);
			types.add(CiatElementTypes.Team_3010);
			types.add(CiatElementTypes.Group_3011);
			types.add(CiatElementTypes.Rol_3015);
			types.add(CiatElementTypes.Actor_3016);
			types.add(CiatElementTypes.SoftwareAgent_3017);
			types.add(CiatElementTypes.Team_3018);
			types.add(CiatElementTypes.Group_3019);
			types.add(CiatElementTypes.Rol_3022);
			types.add(CiatElementTypes.Actor_3023);
			types.add(CiatElementTypes.SoftwareAgent_3024);
			types.add(CiatElementTypes.Team_3025);
			types.add(CiatElementTypes.Group_3026);
		}
		return types;
	}

}
