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

import ciat.diagram.edit.parts.SharedObjectEditPart;
import ciat.diagram.providers.CiatElementTypes;
import ciat.diagram.providers.CiatModelingAssistantProvider;

/**
 * @generated
 */
public class CiatModelingAssistantProviderOfSharedObjectEditPart extends CiatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(CiatElementTypes.ExclusiveEditionArea_3044);
		types.add(CiatElementTypes.CollaborativeArea_3045);
		types.add(CiatElementTypes.IndividualArea_3046);
		types.add(CiatElementTypes.Attribute_3047);
		types.add(CiatElementTypes.Operation_3048);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SharedObjectEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SharedObjectEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CiatElementTypes.ShAssociationLink_4004);
		types.add(CiatElementTypes.ShGeneralizationLink_4005);
		types.add(CiatElementTypes.ShAggregationLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((SharedObjectEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SharedObjectEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SharedObjectEditPart) {
			types.add(CiatElementTypes.ShAssociationLink_4004);
		}
		if (targetEditPart instanceof SharedObjectEditPart) {
			types.add(CiatElementTypes.ShGeneralizationLink_4005);
		}
		if (targetEditPart instanceof SharedObjectEditPart) {
			types.add(CiatElementTypes.ShAggregationLink_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SharedObjectEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SharedObjectEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CiatElementTypes.ShAssociationLink_4004) {
			types.add(CiatElementTypes.SharedObject_3043);
		} else if (relationshipType == CiatElementTypes.ShGeneralizationLink_4005) {
			types.add(CiatElementTypes.SharedObject_3043);
		} else if (relationshipType == CiatElementTypes.ShAggregationLink_4006) {
			types.add(CiatElementTypes.SharedObject_3043);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((SharedObjectEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(SharedObjectEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CiatElementTypes.ShAssociationLink_4004);
		types.add(CiatElementTypes.ShGeneralizationLink_4005);
		types.add(CiatElementTypes.ShAggregationLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SharedObjectEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(SharedObjectEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CiatElementTypes.ShAssociationLink_4004) {
			types.add(CiatElementTypes.SharedObject_3043);
		} else if (relationshipType == CiatElementTypes.ShGeneralizationLink_4005) {
			types.add(CiatElementTypes.SharedObject_3043);
		} else if (relationshipType == CiatElementTypes.ShAggregationLink_4006) {
			types.add(CiatElementTypes.SharedObject_3043);
		}
		return types;
	}

}
